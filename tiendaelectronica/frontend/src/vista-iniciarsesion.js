import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-form-layout/vaadin-form-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-form-layout/vaadin-form-item.js';
import '@vaadin/vaadin-button/vaadin-button.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-item.js';

class VistaIniciarsesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-form-layout style="width: 100%; height: 100%;">
 <vaadin-form-item>
  <label slot="label">Crear cuenta</label>
 </vaadin-form-item>
 <vaadin-form-item>
  <label slot="label">Iniciar sesión</label>
 </vaadin-form-item>
 <vaadin-text-field label="Email" placeholder="Introduce tu email para registrarte"></vaadin-text-field>
 <vaadin-text-field label="Email" placeholder="Introduce tu email"></vaadin-text-field>
 <vaadin-text-field label="Contraseña" placeholder="Introduce tu constraseña para registrarte"></vaadin-text-field>
 <vaadin-text-field label="Contraseña" placeholder="Introduce tu constraseña"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button theme="primary">
   Crear cuenta
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button theme="primary">
   Iniciar sesión
  </vaadin-button>
  <vaadin-button theme="tertiary">
   Recuperar contraseña
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-form-layout>
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
