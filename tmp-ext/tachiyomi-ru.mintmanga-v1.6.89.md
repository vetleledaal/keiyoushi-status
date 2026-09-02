# Extension Validation Report

- Extension: tachiyomi-ru.mintmanga-v1.6.89
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6
- Source name: MintManga
- Source language: ru
- Selected manga input: latest offset 0: Мой самый дорогой (`.../moi_samyi_dorogoi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 19 дней — Однажды (`.../19_dnei___odnajdy`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Смирна и Капри (`.../smirna_i_kapri`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Мой самый дорогой (`.../moi_samyi_dorogoi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Руководство для девушки (Перезапуск) (`.../rukovodstvo_dlia_devushki__perezapusk_`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Мой самый дорогой (`.../moi_samyi_dorogoi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Мой самый дорогой (`.../moi_samyi_dorogoi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌍 или включите автоматическую авторизацию в настройках расширения | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌍 или включите автоматическую авторизацию в настройках расширения | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Мой самый дорогой, URL=`.../moi_samyi_dorogoi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mm.one-way.work/.../054.webp` (image/webp (encoding: lossy), 24350 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../moi_samyi_dorogoi` |  |  |  |
| details thumbnail URL | PASS | `https://mm.one-way.work/.../054.webp` |  |  |  |
| details author | PASS | Чхон Ун |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манхва, драма, мужчины, повседневность, романтика, спортивное тело |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 9.3 (голосов: 771)<br>Тео, работающий адвокатом в одной юридической фирме, обеспокоен своим бывшим, который внезапно исчез, прихватив с собой доказательства по одному делу. Помимо этого, в его жизни случается еще одна неприятность – появляются трудности с покупкой "Зеленого дома", о котором мужчина так давно мечтал. Примерно в то же время он сталкивается с Диланом, довольно известным актером, и решает провести с ним ночь. Однако, приняв это решение, Тео даже и не догадывался, к чему это приведет.<br>**Альтернативные названия**:<br>- Мой самый дорогой<br>- Dearest<br>- 디어리스트 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
