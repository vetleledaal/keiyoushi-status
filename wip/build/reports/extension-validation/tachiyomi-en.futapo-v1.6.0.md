# Extension Validation Report

- Extension: tachiyomi-en.futapo-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6194377622357855889
- Source name: Futapo
- Source language: en
- Selected manga input: popular offset 0: [Futa on Male][Hell Teacher Nube] Imouto Goku Minki Hentai Manga by Minemura (`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Futa on Male][Hell Teacher Nube] Imouto Goku Minki Hentai Manga by Minemura (`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Scientific Method Futa Comic by Cyberunique (`.../scientific-method-hq-comic-by-cyberunique`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [Futa on Male][Hell Teacher Nube] Imouto Goku Minki Hentai Manga by Minemura (`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Futa on Male][Hell Teacher Nube] Imouto Goku Minki Hentai Manga by Minemura (`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Futa on Male\]\[Hell Teacher Nube\] Imouto Goku Minki Hentai Manga by Minemura, URL=`.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 49/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://futapo.com/.../Hell-Teacher-Nube-Imouto-Goku-Minki-Futa-Manga-by-Mine-Noujou-1-600x847.png` (image/png, 241738 bytes, 600x847) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hell-teacher-nube-imouto-goku-minki-futa-manga-by-minemura` |  |  |  |
| details thumbnail URL | PASS | `https://futapo.com/.../Hell-Teacher-Nube-Imouto-Goku-Minki-Futa-Manga-by-Mine-Noujou-1-600x847.png` |  |  |  |
| details author | PASS | Minemura |  |  |  |
| details artist | PASS | Minemura |  |  |  |
| details genres | PASS | Futa on Male, Hell Teacher Nube |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[Back to comics\](https://futapo.com/.../futa-comics) – \[Pixiv\](https://www.pixiv.net/.../artworks <redacted query values: p>) – \[Twitter\](https://x.com/.../minefarmkun) – \[DLsite\](https://www.dlsite.com/.../RJ215615)<br><br>Minki has a giant dick and fucks her male teacher Meisuke Nueno in the ass.<br><br>Hell Teacher Nube Futa on Male Rule 34 Futa Porn Hentai Manga by Minemura of the Mine Noujou group. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://futapo.com/.../Hell-Teacher-Nube-Imouto-Goku-Minki-Futa-Manga-by-Mine-Noujou-1.png` (image/png, 1761258 bytes, 1060x1497) |  |  |  |
