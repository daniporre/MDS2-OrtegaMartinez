import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaUsuarionoregistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="primerVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="cabeceraHLayout">
  <vaadin-button id="inicioUNR">
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" id="searchBarUNR" style="flex-grow: 1;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button id="searchIconUNR">
   Buscar
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carritoUNR">
    Carrito 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button id="iniciarSesionUNR">
    Iniciar sesion 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto; align-items: stretch;" id="catalogoVLayout"></vaadin-vertical-layout>
  <vaadin-vertical-layout class="sidebar" style="flex-basis: calc(7*var(--lumo-size-s)); flex-shrink: 0; background-color: var(--lumo-contrast-5pct); align-items: stretch; justify-content: center;" id="adsUNR"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-usuarionoregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUsuarionoregistrado.is, VistaUsuarionoregistrado);
