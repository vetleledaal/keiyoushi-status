# Extension Validation Report

- Extension: tachiyomi-en.ninehentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7689490563697355048
- Source name: NineHentai
- Source language: en
- Selected manga input: popular offset 0: Living With Aunt Hina (`.../152433`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Living With Aunt Hina (`.../152433`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | [Papuka (Shibire Hitsuji)] Bonyuu Shibori Papa no Koto ga Suki sugiru! Sango Kisei Musume [MTL] (`.../152380`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | [Murata Denji] Mesugaki Ririka-chan Wakarase Keikaku 1 (Shoujo Kumikyoku 29) [English] [MTL] (`.../152634`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | [Gincha] Hotel Prison: The Lewd Mother and Daughter (`.../152616`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | [ShiftAltOn (Tonda)] Shakkin 500-oku o Nikutai de Harau Hame ni Natta Ojou-sama | An Heiress Forced to Pay Off Fifty Billion Yen in Debt with Her Body [English] [Stationary Target] (`.../152615`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Living With Aunt Hina (`.../152433`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../152433`) |  | <1s |
| pages | `getPageList(chapter)` | success | 111 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 8: title=Living With Aunt Hina, URL=`.../152433` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.9hentai.so/.../cover.jpg` (image/jpeg, 74974 bytes, 350x496) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../152433` |  |  |  |
| details thumbnail URL | PASS | `https://i.9hentai.so/.../cover.jpg` |  |  |  |
| details author | PASS | Unknown circle |  |  |  |
| details artist | PASS | Elijahzx |  |  |  |
| details genres | PASS | Big Penis, Smalldom, Aunt, Bbw, Big Areolae, Big Ass, Big Breasts, Blowjob, Milf, Mixed, Comic, Full Color |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Title: ヒナおばさんと暮らす<br><br>Pages: 111 pages<br><br>Category: Manga<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 111 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.9hentai.so/.../1.jpg` (image/jpeg, 558661 bytes, 1280x1759) |  |  |  |
