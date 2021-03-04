import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-gestionarusuarios`
 *
 * VistaGestionarusuarios element.
 *
 * @customElement
 * @polymer
 */
class VistaGestionarusuarios extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
