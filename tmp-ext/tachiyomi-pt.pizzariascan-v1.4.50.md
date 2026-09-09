# Extension Validation Report

- Extension: tachiyomi-pt.pizzariascan-v1.4.50
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangawork
- Source ID: 3359822911747375789
- Source name: PizzariaScan
- Source language: pt-BR
- Selected manga input: latest offset 0: Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~ (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~ (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~ (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~ (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 59 | Capítulo 1 (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~, URL=`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | HTTP error 429 |  |  |  |
| latest pagination | SKIP | HTTP error 429 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pizzariacomics.com/.../57f29c8b-fe7c-4e29-a439-f68cdca1ad85.jpg.512.jpg` (image/jpeg, 143296 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru-3` |  |  |  |
| details thumbnail URL | PASS | `https://pizzariacomics.com/.../57f29c8b-fe7c-4e29-a439-f68cdca1ad85.jpg.512.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Drama, Fantasia, Harem, Isekai, Reencarnação, Romance, Video Games |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | As personagens mães que aparecem no jogo MamaFan são todas sub-heroínas infelizes que sempre têm finais ruins. “Por que… Por que mães tão fofas têm que morrer?!” Embora o protagonista tenha se esforçado muito para solicitar uma rota em que elas fossem salvas, todos os seus esforços foram em vão, fazendo com que ele passasse seus dias frustrado. Então, em um determinado dia, ele subitamente reencarna no mundo de MamaFan… No entanto, ele reencarna como um aristocrata vilão que só tem as piores rotas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pizzariacomics.com/.../001.jpg` (image/jpeg, 52880 bytes, 1080x720) |  |  |  |
