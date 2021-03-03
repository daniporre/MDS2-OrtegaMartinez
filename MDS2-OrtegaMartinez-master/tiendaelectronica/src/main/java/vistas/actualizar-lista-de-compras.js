import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class ActualizarListaDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout">
  <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; flex-shrink: 1;">
   <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
  </vaadin-button>
  <div style="flex-grow: 1;">
    Div 
  </div>
  <vaadin-button theme="primary" style="flex-grow: 0; flex-shrink: 0;">
   Actualizar lista de compras
  </vaadin-button>
  <div style="flex-grow: 1;">
    Div 
  </div>
  <vaadin-button theme="primary" style="flex-grow: 0; flex-shrink: 0;">
   Cerrar sesión
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'actualizar-lista-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ActualizarListaDeCompras.is, ActualizarListaDeCompras);
