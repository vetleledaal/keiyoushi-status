# Extension Validation Report

- Extension: tachiyomi-es.monopolyscan-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 5862188113261788590
- Source name: Monopoly Scan
- Source language: es
- Selected manga input: popular offset 0: Todo comienza con un balance de mil billones en el Inframundo (`.../2721`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Todo comienza con un balance de mil billones en el Inframundo (`.../2721`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Para Salvar a las 7 Villanas, Las Hice Parte De Mi Harem (`.../2664`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../2764`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Puedo infligir críticos infinitos (`.../2577`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Todo comienza con un balance de mil billones en el Inframundo (`.../2721`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Todo comienza con un balance de mil billones en el Inframundo (`.../2721`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 130 | capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Todo comienza con un balance de mil billones en el Inframundo, URL=`2721` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://monopolymanhua.com/.../Todo-comienza-con-un-balance-de-mil-billones-en-el-Inframundo-2-350x476.webp` (image/webp (encoding: lossy), 31062 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2721` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://monopolymanhua.com/.../Todo-comienza-con-un-balance-de-mil-billones-en-el-Inframundo-2.webp` (image/webp (encoding: lossy), 277448 bytes, 800x1199) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Aventura, Cultivación, Misterio, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tras desafiar el control de la muerte, Yu Lin despierta el «Sistema del Magnate Divino», que le otorga pagos diarios en efectivo. Pero hay un truco: el dinero son tokens del inframundo. Años después, es elegido como uno de los pocos afortunados para probar Global Menace, un juego de terror donde solo los mejores y más fuertes pueden sobrevivir. Mientras otros apaciguan frenéticamente a los fieros espíritus, Yu Lin recluta seguidores fantasmas leales con sus gastos de magnate. ¡Parece que tener dinero es todo lo que necesitas para gobernar el inframundo! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 130 chapters |  |  |  |
| chapter dates | LINT | All 130 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=130 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://monopolymanhua.com/.../1_01.avif` (image/avif (format: avif), 1033929 bytes, 800x15000) |  |  |  |
