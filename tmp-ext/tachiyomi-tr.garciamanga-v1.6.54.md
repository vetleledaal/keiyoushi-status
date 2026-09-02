# Extension Validation Report

- Extension: tachiyomi-tr.garciamanga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4962507861930922611
- Source name: Garcia Manga
- Source language: tr
- Selected manga input: popular offset 0: Boruto: Two Blue Vortex (`.../233`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | Boruto: Two Blue Vortex (`.../233`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | Boruto: Two Blue Vortex (`.../233`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boruto: Two Blue Vortex (`.../233`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto: Two Blue Vortex (`.../233`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 36 | Bölüm 1 - PART 2 - BORUTO!! (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boruto: Two Blue Vortex, URL=`233` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://garciamanga.com/.../garcia-boruto-kapak-1-350x476.png` (image/png, 290578 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `233` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://garciamanga.com/.../garcia-boruto-kapak-1-193x278.png` (image/png, 103391 bytes, 193x278) |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | Ikemoto Mikio |  |  |  |
| details genres | PASS | Aksiyon, Dövüş, Macera, Shounen, Süper Güçler, Boruto Çeviri, Boruto Türkçe Oku, Manga Türkçe Oku, Türkçe Boruto, Türkçe Manga, Two Blue Wortex Çeviri, Two Blue Wortex Türkçe Oku |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Boruto Two Blue Vortex Oku! Boruto güçlü bir şekilde geri döndü ama şimdiye kadarki en zorlu rakibi olan Gizli Yaprak Köyü ile karşı karşıya! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0000000001.jpg` (image/jpeg, 267383 bytes, 1600x900) |  |  |  |
