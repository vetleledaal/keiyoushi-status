# Extension Validation Report

- Extension: tachiyomi-fr.hotmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: komiko
- Source ID: 1831678223662271773
- Source name: Hot Manga
- Source language: fr
- Selected manga input: popular offset 0: Amoral Island - Édition Prestige (volume 1) (`.../186`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Amoral Island - Édition Prestige (volume 1) (`.../186`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | TSF Monogatari (`.../52`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Frustration Girls (`.../191`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Harem Spiral (`.../160`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Amoral Island - Édition Prestige (volume 1) (`.../186`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Amoral Island - Édition Prestige (volume 1) (`.../186`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Extrait (`.../186`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Amoral Island - Édition Prestige (volume 1), URL=`amoral-island-edition-prestige-volume-1/186` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.hot-manga.fr/.../186.webp` (image/webp (encoding: lossy), 58968 bytes, 400x569) |  |  |  |
| details identity | PASS | Details preserved selected URL `amoral-island-edition-prestige-volume-1/186` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.hot-manga.fr/.../186.webp` (image/webp (encoding: lossy), 662408 bytes, 2079x2953) |  |  |  |
| details author | PASS | Alp |  |  |  |
| details artist | PASS | Alp |  |  |  |
| details genres | PASS | Comédie, Grosse poitrine, MILF, Harem, Arc narratif, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tankoubon · +18 ans<br><br>**Une île oubliée, un remède légendaire et des rencontres qui changent tout.**<br><br>Subaru, Saki et Mikuri se rendent sur une île reculée dans l'espoir de découvrir la vérité derrière un mystérieux remède de jouvence. Mais leurs recherches prennent une tournure inattendue lorsqu'ils font la connaissance des jumelles Ui et Uka, qui leur dévoilent les coutumes pour le moins particulières des habitants.<br><br>Peu à peu, les trois visiteurs se laissent séduire par un mode de vie où désir, liberté et traditions locales s'entremêlent. Ce qui devait être une simple mission professionnelle devient alors une expérience aussi dépaysante qu'inoubliable.<br><br>**Entre harem tropical, romance légère et traditions insolites.**<br><br>Portée par un casting féminin particulièrement attachant, cette série mêle aventure insulaire, sensualité et humour dans une ambiance étonnamment chaleureuse. Entre habitantes charismatiques, situations imprévues et rapprochements multiples, Amoral Island propose une lecture aussi généreuse que divertissante.<br><br>Cette édition prestige au format B5 comprend 12 pages couleur, un papier premium et les six premiers épisodes de cette saga devenue l'une des révélations récentes du genre.<br><br>**Un souffle de fraîcheur sur le fantasme de l'île paradisiaque.**<br><br>Là où beaucoup de récits reposant sur des coutumes locales privilégient le mystère ou la tension, Alp opte pour une approche plus lumineuse et décomplexée. Son dessin très charnel, son sens de l'atmosphère et la complicité entre les personnages donnent naissance à un harem moderne, séduisant et remarquablement immersif. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.hot-manga.fr/.../1.webp` (image/webp (encoding: lossy), 122750 bytes, 1408x2000) |  |  |  |
