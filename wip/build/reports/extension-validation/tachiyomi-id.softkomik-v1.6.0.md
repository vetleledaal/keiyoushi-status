# Extension Validation Report

- Extension: tachiyomi-id.softkomik-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4398521787288838980
- Source name: Softkomik
- Source language: id
- Selected manga input: popular offset 0: Nano Machine (`.../nano-machine-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Solo Leveling (`.../solo-leveling-bahasa-indonesia`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Bring the Love (제스트쿄 (zestkyō)) (`.../bring-the-love-zestky-bahasa-indonesia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Yani Neko (`.../yani-neko-bahasa-indonesia`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 336 | Chapter 1 (`.../001`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nano Machine, URL=`nano-machine-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.softdevices.my.id/.../nano-machine.webp` (image/webp (encoding: lossy), 24698 bytes, 200x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `nano-machine-bahasa-indonesia` |  |  |  |
| details thumbnail URL | PASS | `https://cover.softdevices.my.id/.../nano-machine.webp` |  |  |  |
| details author | PASS | Han-Joong-Wueol-Ya \[Add, \] |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Martial Arts, Fantasy, Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah direndahkan dan menghabiskan hidupnya dalam bahaya, seorang yatim piatu dari pemuja iblis, Yeo-Woon, mendapatkan kunjungan tak terduga dari keturunannya dari masa depan yang memasukkan sebuah mesin nano ke dalam tubuh Cheon-Woon, yang mengubah hidup Cheon Yeo Woon setelah aktivasi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 336 chapters |  |  |  |
| chapter dates | LINT | All 336 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=336 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../321` at offsets 12, 13, `.../314` at offsets 20, 21 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://psy1.komik.im/.../softkomik-0010.webp <redacted query values: id>` (image/webp (encoding: lossy), 217006 bytes, 1124x768) |  |  |  |
