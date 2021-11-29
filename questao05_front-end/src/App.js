import logo from './logo.png';
import './App.css';
import Body from './component/Body';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Cadastro de Veículos
        </p>
      </header>
      <Body>
        
      </Body>
    </div>
  );
}

export default App;
