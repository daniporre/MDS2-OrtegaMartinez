import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaMispedidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout" style="flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: stretch; justify-content: center; align-items: stretch; padding: var(--lumo-space-s);">
 <vaadin-horizontal-layout class="content" style="align-self: stretch;" theme="spacing">
  <h4 id="fechaLabel" style="align-self: center;">fecha</h4>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <h4 id="referenciaLabel" style="align-self: center;">refer</h4>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <h4 id="totalLabel" style="align-self: center;">total</h4>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <h4 id="estadoLabel" style="align-self: center; flex-grow: 0;">estado</h4>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="verPedidoButton" style="align-self: center;">
    Ver pedido 
  </vaadin-button>
  <vaadin-button theme="primary error" id="cancelarPedidoButton" style="align-self: center;">
    Cancelar Pedido 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mispedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMispedidos.is, VistaMispedidos);
