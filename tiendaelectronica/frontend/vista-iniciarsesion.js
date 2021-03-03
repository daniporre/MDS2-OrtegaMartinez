import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-iniciarsesion`
 *
 * VistaIniciarsesion element.
 *
 * @customElement
 * @polymer
 */
class VistaIniciarsesion extends PolymerElement {

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
        return 'vista-iniciarsesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciarsesion.is, VistaIniciarsesion);
