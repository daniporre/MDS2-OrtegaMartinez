import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrador`
 *
 * VistaAdministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrador extends PolymerElement {

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
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);
