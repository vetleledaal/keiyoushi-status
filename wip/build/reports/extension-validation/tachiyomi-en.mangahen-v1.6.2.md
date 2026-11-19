# Extension Validation Report

- Extension: tachiyomi-en.mangahen-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6602595408477221375
- Source name: Gensura
- Source language: en
- Selected manga input: popular offset 0: Karakaix 2 (`.../karakaix-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Karakaix 2 (`.../karakaix-2`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | Nanabangai no Onna (`.../nanabangai-no-onna`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 42 | Uzaki-chan Haha wa Dosukebe Shitai! (`.../uzaki-chan-haha-wa-dosukebe-shitai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | Ochita Chou ~Smoothie Choukyou Hen~ (`.../ochita-chou-smoothie-choukyou-hen`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Karakaix (`.../karakaix`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Karakaix 2 (`.../karakaix-2`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 1 - Karakaix (`.../karakaix`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | <1s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Karakaix 2, URL=`.../karakaix-2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 175/175 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 175/175 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gensura.net/.../thumbnail.webp` (image/webp (encoding: lossy), 21062 bytes, 355x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../karakaix-2` |  |  |  |
| details thumbnail URL | PASS | `https://gensura.net/.../thumbnail.webp` |  |  |  |
| details author | PASS | Shinohara Heavy Industry |  |  |  |
| details artist | PASS | Haruna Mao, Ukyochu |  |  |  |
| details genres | PASS | Impregnation, Kodomo Doushi, Kodomo Only, Lolicon, Nakadashi, Schoolboy Uniform, Schoolgirl Uniform, Shotacon, Sole Female, Sole Male |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Categories: Doujinshi<br>Parodies: Karakai Jouzu No Takagi-san<br>Circles: Shinohara Heavy Industry<br><br>Pages: 37<br>Views: 4807<br><br>Main Series: Karakaix<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gensura.net/.../7e37b87453abeb72436e.webp` (image/webp (encoding: lossy), 93482 bytes, 1065x1500) |  |  |  |
