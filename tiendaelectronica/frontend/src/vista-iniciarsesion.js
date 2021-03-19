import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';

class VistaIniciarsesion extends PolymerElement {

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
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; align-items: center; flex-direction: row; justify-content: center;">
  <vaadin-form-layout style="align-self: center; flex-shrink: 0; flex-grow: 0;">
   <label style="width: 55%;">Crear cuenta</label>
   <vaadin-text-field label="Email" id="mailNuevaCuentaTF" style="width: 55%;"></vaadin-text-field>
   <vaadin-text-field label="Contraseña" id="contraseñaNuevaCuentaTF" style="width: 55%;"></vaadin-text-field>
   <vaadin-button id="crearNuevaCuentaButton" style="width: 55%;">
     Crear cuenta 
   </vaadin-button>
  </vaadin-form-layout>
  <vaadin-login-form id="logIn" style="margin: var(--lumo-space-l);"></vaadin-login-form>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-iniciarsesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciarsesion.is, VistaIniciarsesion);
