import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-form-layout/vaadin-form-layout.js';

class VistaGestionarusuarios extends PolymerElement {

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
</vaadin-form-layout>
`;
    }

    static get is() {
        return 'vista-gestionarusuarios';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionarusuarios.is, VistaGestionarusuarios);
