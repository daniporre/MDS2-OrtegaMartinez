import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaVerfichadeusuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button theme="icon" aria-label="Add new" id="atrasButton">
   <iron-icon icon="lumo:plus"></iron-icon>Atrás 
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <label style="align-self: center;">Ver ficha de usuario</label>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; margin: var(--lumo-space-l); height: 100%;">
  <h2>Nombre:</h2>
  <label id="nombreUsuarioLabel">nombreUsuario</label>
  <h2>Dirección:</h2>
  <label id="calleUsuarioLabel">calleUsuario</label>
  <label id="numeroPortalUsuarioLabel">numeroPortalUsuario</label>
  <label id="codigoPostalUsuarioLabel">codigoPostalUsuario</label>
  <label id="cuidadUsuarioLabel">cuidadUsuario</label>
  <label id="provinciaUsuarioLabel">provinciaUsuario</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verfichadeusuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerfichadeusuario.is, VistaVerfichadeusuario);
