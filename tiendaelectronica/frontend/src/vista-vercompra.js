import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVercompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-m);">
  <h3 id="nombreProductoLabel" style="align-self: center;">Nombre Producto</h3>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-content: flex-start; flex-shrink: 0;">
   <h3 style="flex-shrink: 0;">Pedido realizado:</h3>
   <label id="fechaPedidoLabel" style="flex-shrink: 0;">Label</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-content: flex-start; flex-shrink: 0;">
   <h3 style="flex-shrink: 0;">Enviado a:</h3>
   <label id="enviadoALabel" style="flex-shrink: 0;">Label</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-content: flex-start; flex-shrink: 0;">
   <h3 style="flex-shrink: 0;">Precio:</h3>
   <label id="precioPedidoLabel" style="flex-shrink: 0;">Label</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-content: flex-start; flex-shrink: 0; align-items: flex-start;">
   <h3 style="flex-shrink: 0;">Número de pedido:</h3>
   <label id="numeroPedidoLabel" style="flex-shrink: 0;">Label</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-end; margin: var(--lumo-space-m);">
  <vaadin-button id="verFichaUsuarioButton">
   Ver ficha Usuario
  </vaadin-button>
  <vaadin-button theme="primary" id="recibidoButton">
   Recibido
  </vaadin-button>
  <vaadin-button theme="primary" id="enviarPedidoButton">
   Enviar pedido
  </vaadin-button>
  <label id="estadoPedidoLabel" style="align-self: center;">EstadoPedido</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercompra.is, VistaVercompra);
