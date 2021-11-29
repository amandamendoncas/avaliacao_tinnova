import React from "react"
import "./Item.css"

class Item extends React.Component {


    render() {
        return (
            <div className="Item-texto">
                <div>
                    <label>Veículo: </label>
                    <span>{this.props.veiculo.veiculo}</span>
                </div>
                <div>
                    <label>Marca: </label>
                    <span>{this.props.veiculo.marca}</span>
                </div>
                <div>
                    <label>Ano: </label>
                    <span>{this.props.veiculo.ano}</span>
                </div>
                <div>
                    <label>Descrição: </label>
                    <span>{this.props.veiculo.descricao}</span>
                </div>
                <div>
                    <label>Vendido: </label>
                 {this.props.veiculo.vendido ? <span>sim</span> : <span>não</span>}
                </div>
                <div>
                    <label>Data Criação: </label>
                    <span>{this.props.veiculo.created}</span>
                </div>
                <div>
                    <label>Data Update: </label>
                    <span>{this.props.veiculo.update}</span>
                </div>

            </div>

        )


    }

}
export default Item