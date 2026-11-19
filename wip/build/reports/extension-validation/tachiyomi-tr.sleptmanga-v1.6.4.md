# Extension Validation Report

- Extension: tachiyomi-tr.sleptmanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2901533594719087473
- Source name: Slept Manga
- Source language: tr
- Selected manga input: popular offset 0: Ölü Köşk (`.../olu-kosk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Ölü Köşk (`.../olu-kosk`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | A morning kiss at Tiffany's (`.../a-morning-kiss-at-tiffanys`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Nine Dragons: COPÓKA (`.../nine-dragons-copoka`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 23 | Princess and Dragon (`.../princess-and-dragon`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ölü Köşk (`.../olu-kosk`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ölü Köşk (`.../olu-kosk`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Bölüm 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ölü Köşk, URL=`.../olu-kosk` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.sleptmanga.com.tr/.../juvenile-law2.webp` (image/webp (encoding: lossy), 119864 bytes, 1200x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../olu-kosk` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sleptmanga.com.tr/.../juvenile-law2.webp` |  |  |  |
| details author | PASS | mhitra |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Macera, Okul |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Çocuklar–saf, koruyucu aileleriyle yeni bir başlangıç yapmaya hazırlar ancak burada, Ölü Köşk'te, o masum gibi görünen özellikler ölümcül yeteneklere dönüşüyor. Yetimlerimiz, en seçkin eğitmenler tarafından eğitiliyor ve sizin en yüksek beklentilerinizi karşılayacak şekilde yetiştiriliyor. Kesinlikle etkileyici olmaları garanti. Ancak bu koruyucu meleklerin yüksek bir bedeli var. Sonuçta, mükemmellik acımasız bir lükstür. Kataloğu görmek ister misiniz? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 401 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
