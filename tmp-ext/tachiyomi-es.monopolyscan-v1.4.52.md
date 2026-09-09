# Extension Validation Report

- Extension: tachiyomi-es.monopolyscan-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5862188113261788590
- Source name: Monopoly Scan
- Source language: es
- Selected manga input: popular offset 0: Todo comienza con un balance de mil billones en el Inframundo (`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Todo comienza con un balance de mil billones en el Inframundo (`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | ¡Me hago más fuerte al dormir! (`.../me-hago-mas-fuerte-al-dormir`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ¡Mientras mis discipulos se matan entrenando, yo me relajo! (`.../mientras-mis-discipulos-se-matan-entrenando-yo-me-relajo`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Cuñada: ¡De verdad… ya no soy un idiota! (`.../cunada-de-verdad-ya-no-soy-un-idiota`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Todo comienza con un balance de mil billones en el Inframundo (`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Todo comienza con un balance de mil billones en el Inframundo (`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 130 | capítulo 1 (`https://monopolymanhua.com/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Todo comienza con un balance de mil billones en el Inframundo, URL=`.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://monopolymanhua.com/.../Todo-comienza-con-un-balance-de-mil-billones-en-el-Inframundo-2-350x476.webp` (image/webp (encoding: lossy), 31062 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../todo-comienza-con-un-balance-de-mil-billones-en-el-inframundo` |  |  |  |
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
| chapter URLs | UNUSUAL | All 130 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://monopolymanhua.com/.../1_01.avif` (image/avif (format: avif), 1033929 bytes, 800x15000) |  |  |  |
