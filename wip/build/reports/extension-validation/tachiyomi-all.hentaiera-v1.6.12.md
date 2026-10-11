# Extension Validation Report

- Extension: tachiyomi-all.hentaiera-v1.6.12
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 647637185891033517
- Source name: HentaiEra
- Source language: en
- Selected manga input: popular offset 0: [Chinjao Girl. (Kemuri Haku)] Toaru Daikazoku no Okazu Jijou ~Mamagawari Onee-chan Funtouki~ [English] [Amoskandy] (`.../782519`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [Chinjao Girl. (Kemuri Haku)] Toaru Daikazoku no Okazu Jijou ~Mamagawari Onee-chan Funtouki~ [English] [Amoskandy] (`.../782519`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | [Aomizuan, Maron☆Maron] Lucky Dosukebe! Kouhen | Lucky Pervert! The Sequel [English] [Seven] (`.../812764`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | [rakuen senka] Himitsu no Boshi Sōkan | Secret Mother & Son Incest [English] [Plw-MTL] (`.../1747368`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Misaki(Taisho)] One Day My Childhood Friend Turned Into an Enormous Oni [English] (`.../1747268`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Chinjao Girl. (Kemuri Haku)] Toaru Daikazoku no Okazu Jijou ~Mamagawari Onee-chan Funtouki~ [English] [Amoskandy] (`.../782519`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../782519`) |  | <1s |
| pages | `getPageList(chapter)` | success | 238 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Misaki(Taisho)\] One Day My Childhood Friend Turned Into an Enormous Oni \[English\], URL=`.../1747268` at page 1 offset 22 and page 2 offset 0, title=Freshly Squeezed Art, URL=`.../1747267` at page 1 offset 23 and page 2 offset 1, title=\[Nanao Yukiji\] Mesu no Honnou ni Sakaraenai \[English\] \[Decensored\] \[Coffedrug, Comoop, menospeaknihongo, timemaster17\] \[Digital\], URL=`.../1747266` at page 1 offset 24 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m5.hentaiera.com/.../thumb.jpg` (image/jpeg, 33528 bytes, 250x187) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../782519` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://m5.hentaiera.com/.../cover.jpg` (image/jpeg, 57833 bytes, 350x263) |  |  |  |
| details author | PASS | kemuri haku |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | anal, blowjob, daughter, double penetration, group, harem, incest, masturbation, mmf threesome, moral degeneration, mosaic censorship, nakadashi, pixie cut, schoolgirl uniform, shotacon, sister, sole female, story arc, tomboy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Groups**: chinjao girl.<br><br>**Languages**: english, translated<br><br>**Category**: artist cg<br><br>**Pages**: 238<br><br>**Alternative title**: \[チンジャオ娘 (煙ハク)\] とある大家族のオカズ事情～ママ代わりお姉ちゃん奮闘記～\[英訳\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 238 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m5.hentaiera.com/.../1.jpg` (image/jpeg, 92941 bytes, 560x420) |  |  |  |
