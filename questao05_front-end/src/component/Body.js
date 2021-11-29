import React from "react"
import axios from "axios"
import Item from "./Item"
import "./Body.css"
class Body extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            veiculos: []
        }
    }

    render() {
        let lista;
        if (this.state.veiculos.length > 0) {
            lista = this.state.veiculos.map((veiculo) => {
                return <Item veiculo={veiculo} />
            })
        } else {
            lista = <div>Não possui dados</div>
        }
        return (
            <div className="Body-style">
                <button onClick={() => this.listarVeiculos()}>
                    Listar Veículos
                </button>
                {lista}
            </div>

        )


    }

    listarVeiculos() {
        axios.get("http://localhost:8080/veiculos").then((veiculos) => {
            console.log(veiculos)
            this.setState({
                veiculos: veiculos.data
            })
        })

    }

}
export default Body