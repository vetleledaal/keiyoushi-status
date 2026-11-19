# Extension Validation Report

- Extension: tachiyomi-tr.kazescans-v1.6.20
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8948534014820087218
- Source name: KazeScans
- Source language: tr
- Selected manga input: popular offset 0: Terminally-Ill Genius Dark Knight (`.../hastalkl-kara-sovalye.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | Terminally-Ill Genius Dark Knight (`.../hastalkl-kara-sovalye.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | Return of the Apocalypse-Class Death Knight (`.../return-of-apocalypse-class-death-knight.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Terminally-Ill Genius Dark Knight (`.../hastalkl-kara-sovalye.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Terminally-Ill Genius Dark Knight (`.../hastalkl-kara-sovalye.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 117 | Terminally-Ill Genius Dark Knight Bölüm 1 (`.../hastalkl-kara-sovalye-bolum-1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Terminally-Ill Genius Dark Knight, URL=`.../hastalkl-kara-sovalye.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 9/9 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 9/9 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Hastal%C4%B1kl%C4%B1%20Kara%20%C5%9E%C3%B6valye%20kapak.png` (image/png, 254162 bytes, 300x402) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hastalkl-kara-sovalye.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Hastal%C4%B1kl%C4%B1%20Kara%20%C5%9E%C3%B6valye%20kapak.png` (image/webp (container: extended), 2753672 bytes, 1195x1600) |  |  |  |
| details author | PASS | Jung Seon-yul, Nagi (II) |  |  |  |
| details artist | PASS | Jung Seon-yul, Nagi (II) |  |  |  |
| details genres | PASS | Aksiyon, Dram, Harem, Fantastik, Shounen, Macera |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aşırı zorluğuyla ünlü bir RPG oyunu. Aynı zamanda doğduğundan beri ölümcül hastalıklarla boğuşan Yoo Chan’ın hayatındaki tek kaçış yeriydi. Şimdiyse hayatının ta kendisi. Yoo Chan artık oyunun en berbat kötüsü Nox von Reinharber olarak hayatına devam etmek zorunda. Yeni hayatında hikayenin sonunu görebilecek mi? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 117 chapters |  |  |  |
| chapter dates | PASS | 117 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../01.jpg` (image/webp (container: extended), 1064996 bytes, 684x16000) |  |  |  |
