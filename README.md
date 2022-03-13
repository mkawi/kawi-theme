# Kawi Nightshade Theme

<img src="https://github.com/mkawi/kawi-theme/raw/main/images/preview.png" alt="Preview">

Currently only available on Visual Studio Code.

## Variants

- Kawi Nightshade - Dark
- Kawi Nightshade - Dark (italic)

## Installation

1.  Install [Visual Studio Code](https://code.visualstudio.com/)
2.  Launch Visual Studio Code
3.  Choose **Extensions** from menu
4.  Search for `kawi`
5.  Click **Install** to install it
6.  Click **Reload** to reload the Code
7.  From the menu bar click: Code > Preferences > Color Theme > Pick your Kawi theme variant

## Preview Preferences

I haven't included a font in this release as I know that it's a very personal preference.

The font in the preview image is JetBrains Mono, [available here](https://www.jetbrains.com/lp/mono/). Editor settings to activate font ligatures:

```
"editor.fontFamily": "JetBrains Mono",
"editor.fontLigatures": true,
```

The preview image is using [Bracket Pair Colorizer](https://marketplace.visualstudio.com/items?itemName=CoenraadS.bracket-pair-colorizer), a really cool extension that highlights matching brackets. This can help reduce unwanted errors.

I use this setting:

```
"bracketPairColorizer.forceIterationColorCycle": true,
```

![Bracket](./images/bracket.png)

## Contribute

First, this theme is new so if there are any problems, please open an issue. There are many languages and parts of VS Code I don't use, so let me know!

If you would like to change something, you can either open an Issue/Pull Request and see if I'd like it added, or override the colours in your own settings.json file.

If you are making a Pull Request, Please include a screenshot of before & after!

[https://code.visualstudio.com/docs/getstarted/theme-color-reference](https://code.visualstudio.com/docs/getstarted/theme-color-reference)

- The token colorization is done based on standard TextMate themes. Colors are matched against one or more scopes.

To learn more about scopes and how they're used, check out the [color theme](https://code.visualstudio.com/api/extension-guides/color-theme) documentation.

## Future Plans

- Release light versions of the theme, regular and italic.
- Recreate versions for other code editors (Atom, Sublime Text, Notepad++, etc.)

## Changelog

The changelog is available [here](./CHANGELOG.md).

## License

[MIT License](./LICENSE) © Kawi Theme
