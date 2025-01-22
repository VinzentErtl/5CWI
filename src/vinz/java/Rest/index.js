const express = require('express');
const app = express();
const PORT = 3000;


app.use(express.json());

// Sample data
let people = [
    { id: 1, name: 'Alice', age: 25 },
    { id: 2, name: 'Bob', age: 30 },
    { id: 3, name: 'Charlie', age: 35 }
];

// GET
app.get('/people', (req, res) => {
    res.json(people);
});

app.get('/people/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    const person = people.find(p => p.id === id);
    if (person) {
        res.json(person);
    } else {
        res.status(404).json({ error: 'Person not found' });
    }
});

// POST
app.post('/people', (req, res) => {
    const newPerson = {
        id: people.length ? people[people.length - 1].id + 1 : 1, 
        name: req.body.name,
        age: req.body.age
    };
    people.push(newPerson);
    res.status(201).json(newPerson);
});

// PUT
app.put('/people/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    const personIndex = people.findIndex(p => p.id === id);
    if (personIndex !== -1) {
        people[personIndex] = { ...people[personIndex], ...req.body };
        res.json(people[personIndex]);
    } else {
        res.status(404).json({ error: 'Person not found' });
    }
});

// DELETE
app.delete('/people/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    const personIndex = people.findIndex(p => p.id === id);
    if (personIndex !== -1) {
        const deletedPerson = people.splice(personIndex, 1);
        res.json(deletedPerson);
    } else {
        res.status(404).json({ error: 'Person not found' });
    }
});


app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});