const express = require('express');
const app = express();
const PORT = 3000;


app.use(express.json());

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
        id: people.length + 1,
        name: req.body.name,
        age: req.body.age
    };
    people.push(newPerson);
    res.json(newPerson);
});

// PUT
app.put('/people/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const person = people.find(p => p.id === id);
    if (person) {
        person.name = req.body.name || person.name;
        person.age = req.body.age || person.age;
        res.json(person);
    } else {
        res.status(404).json({ error: 'Person not found' });
    }
});

// DELETE
app.delete('/people/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const index = people.findIndex(p => p.id === id);
    if (index !== -1) {
        const deletedPerson = people.splice(index, 1);
        res.json(deletedPerson);
    } else {
        res.status(404).json({ error: 'Person not found' });
    }
});


app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});