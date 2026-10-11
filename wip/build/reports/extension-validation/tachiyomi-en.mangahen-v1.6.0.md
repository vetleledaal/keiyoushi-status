# Extension Validation Report

- Extension: tachiyomi-en.mangahen-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Karakaix (`.../karakaix`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Karakaix (`.../karakaix`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | MONSTER Bouyoku no Sumika (`.../monster-bouyoku-no-sumika`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 42 | B-trayal 62 (`.../b-trayal-62`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | B-Trayal 56 Makima (`.../b-trayal-56-makima`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Karakaix (`.../karakaix`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Karakaix (`.../karakaix`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../karakaix`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Karakaix, URL=`.../karakaix` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 173/173 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 173/173 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gensura.net/.../thumbnail.webp` (image/webp (encoding: lossy), 21288 bytes, 355x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../karakaix` |  |  |  |
| details thumbnail URL | PASS | `https://gensura.net/.../thumbnail.webp` |  |  |  |
| details author | PASS | Shinohara Heavy Industry |  |  |  |
| details artist | PASS | Haruna Mao, Ukyochu |  |  |  |
| details genres | PASS | Blowjob, Defloration, Group, Lolicon, Rape, Schoolboy Uniform, Schoolgirl Uniform, Shotacon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Categories: Doujinshi<br>Parodies: Karakai Jouzu No Takagi-san<br>Circles: Shinohara Heavy Industry<br><br>Pages: 34<br>Views: 1440<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gensura.net/.../7e37b87453abeb72436e.webp` (image/webp (encoding: lossy), 93482 bytes, 1065x1500) |  |  |  |
