import { useEffect, useState } from 'react';

type Product = {
  name: string;
  costPrice: number;
  sellingPrice: number;
  unitsSold: number;
  profitMargin: number;
};

function App() {
  const [products, setProducts] = useState<Product[]>([]);

  useEffect(() => {
    fetch('/api/products')
      .then(res => res.json())
      .then(data => setProducts(data));
  }, []);

  return (
    <div style={{ padding: 20 }}>
      <h1>Walmart Inventory Dashboard</h1>
      <table>
        <thead>
          <tr>
            <th>Product</th>
            <th>Cost</th>
            <th>Selling</th>
            <th>Sold</th>
            <th>Profit Margin (%)</th>
          </tr>
        </thead>
        <tbody>
          {products.map((p, i) => (
            <tr key={i}>
              <td>{p.name}</td>
              <td>${p.costPrice}</td>
              <td>${p.sellingPrice}</td>
              <td>{p.unitsSold}</td>
              <td>{p.profitMargin.toFixed(2)}%</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;