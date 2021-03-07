import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVerlistadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); justify-content: space-between;">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
  <vaadin-button theme="primary" id="actualizarListaDeComprasButton">
   Actualizar lista de compras
  </vaadin-button>
  <vaadin-button id="cerrarSesionButton">
   Cerrar sesión
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutPrincipal" style="flex-grow: 1; flex-shrink: 1; margin: var(--lumo-space-l); align-self: stretch; align-items: stretch;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verlistadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerlistadodecompras.is, VistaVerlistadodecompras);
