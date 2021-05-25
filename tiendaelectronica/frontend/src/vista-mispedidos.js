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
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: stretch; justify-content: center;">
 <vaadin-horizontal-layout class="content" style="align-self: stretch;" theme="spacing">
  <h4 id="fechaLabel" style="width: 15%; align-self: center;">fecha</h4>
  <h4 id="referenciaLabel" style="width: 15%; align-self: center;">refer</h4>
  <h4 id="totalLabel" style="width: 15%; align-self: center;">total</h4>
  <h4 id="estadoLabel" style="width: 15%; align-self: center;">estado</h4>
  <vaadin-button id="verPedidoButton" style="align-self: center;">
   Ver pedido
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
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
