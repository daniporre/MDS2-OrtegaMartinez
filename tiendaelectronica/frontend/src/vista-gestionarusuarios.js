import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaGestionarusuarios extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 100%; justify-content: center; margin: var(--lumo-space-xl);">
   <h1 style="align-self: flex-end; width: 70%;">Crear usuario</h1>
   <vaadin-text-field label="Nombre de usuario" id="nuevoUsuarioEmailTF" style="align-self: flex-end; width: 70%;"></vaadin-text-field>
   <vaadin-text-field label="Contraseña" id="nuevoUsuarioContraseñaTF" style="align-self: flex-end; width: 70%;"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 70%;">
    <h4 style="align-self: flex-end; width: 70%;">Rol:</h4>
    <vaadin-combo-box id="rolNuevoUsuarioComboBox" style="align-self: center;"></vaadin-combo-box>
   </vaadin-horizontal-layout>
   <vaadin-button theme="primary" id="nuevoUsuarioButton" style="align-self: flex-end; width: 70%;">
     Crear usuario 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; justify-content: center; flex-grow: 1; margin: var(--lumo-space-xl); margin-right: var(--lumo-space-xl); align-items: flex-start;">
   <h1 style="flex-grow: 0; align-self: stretch; width: 70%; margin-top: var(--lumo-space-xs);">Editar contraseña usuario</h1>
   <h3 style="align-self: flex-start; flex-grow: 0;">Seleccionar usuario:</h3>
   <vaadin-combo-box id="seleccionarUsuarioComboBox" style="width: 70%; flex-grow: 0; flex-shrink: 0; align-self: flex-start;"></vaadin-combo-box>
   <vaadin-text-field label="Contraseña" id="contraseñaUsuarioModificadaTF" style="align-self: stretch; width: 70%; flex-grow: 1;"></vaadin-text-field>
   <vaadin-button theme="primary" id="cambiarContraseñaButton" style="align-self: flex-start; width: 70%;">
     Cambiar contraseña 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
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
