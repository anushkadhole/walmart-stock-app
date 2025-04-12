import express from 'express';
import cors from 'cors';

const app = express();
app.use(cors());

const products = [
  { name: "TV", costPrice: 300, sellingPrice: 500, unitsSold: 120 },
  { name: "Laptop", costPrice: 700, sellingPrice: 1200, unitsSold: 80 }
];

app.get('/api/products', (_req, res) => {
  const response = products.map(p => ({
    ...p,
    profitMargin: ((p.sellingPrice - p.costPrice) / p.costPrice) * 100
  }));
  res.json(response);
});

app.listen(5000, () => {
  console.log("API server running on http://localhost:5000");
});