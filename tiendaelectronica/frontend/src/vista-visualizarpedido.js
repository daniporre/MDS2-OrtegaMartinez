import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaVisualizarpedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" id="searchBar" style="flex-grow: 1;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new" id="buscarButton">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carritoButton">
    Carrito 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button id="miCuentaButton">
    Mi cuenta 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto; align-self: stretch; margin: var(--lumo-space-xl);" theme="spacing-l">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-vertical-layout theme="spacing">
    <h3>Pedido realizado:</h3>
    <label id="fechaPedidoLabel">fechaPedido</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing">
    <h3>Enviado a:</h3>
    <label id="nombreUsuarioPedidoLabel">nombreUsuarioPedido</label>
   </vaadin-vertical-layout>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-vertical-layout theme="spacing">
    <h3>Número de pedido</h3>
    <label id="numeroPedidoLabel">numeroPedido</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-button id="imagenPedido" style="flex-grow: 0;">
     Button 
   </vaadin-button>
   <vaadin-vertical-layout theme="spacing">
    <h3 id="nombreProductoPedido">nombreProductoPedido</h3>
    <vaadin-horizontal-layout theme="spacing">
     <label>TOTAL</label>
     <label id="precioPedidoLabel">precioPedido</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-text-area label="Escribe una valoración del pedido" id="descripcionTextArea" style="align-self: stretch;"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-end;">
   <label id="valoracionEstrellasLabel" style="align-self: center;">valoracionEstrellas</label>
   <vaadin-button theme="primary" id="valorarProductoButton">
     Valorar producto 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-visualizarpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVisualizarpedido.is, VistaVisualizarpedido);
