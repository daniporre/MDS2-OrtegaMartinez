import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="name-header">
  <label id="product-name">nombreProd</label>
  <vaadin-tab style="flex-grow: 1;" id="vaadinTab"></vaadin-tab>
  <label id="product-id">3000</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; flex-shrink: 0;" id="vaadinHorizontalLayout">
  <img id="product-img" style="flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" id="product-data" style="flex-grow: 1; flex-shrink: 0; justify-content: space-around; flex-direction: column;">
   <label id="pedido-realizado" style="flex-grow: 0;">Pedido realizado:</label>
   <label id="pedido-fecha">01/01/2021</label>
   <label id="pedido-precio">10.00€</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 100%;">
  <vaadin-button id="verperfilusuario-button">
   Ver perfil Usuario 
  </vaadin-button>
  <vaadin-button id="recibidp-button">
   Recibido 
  </vaadin-button>
  <label id="recibido-button">Recibido</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompra.is, VistaCompra);
