# Extension Validation Report

- Extension: tachiyomi-id.dojingnet-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8062443260299418342
- Source name: Dojing.net
- Source language: id
- Selected manga input: latest offset 0: Gadis Yang Kukenal di Buku Deary (`.../gadis-yang-kukenal-di-buku-deary`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Lustful Wife Widia (`.../lustful-wife-widia`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Meniduri Ibunya Saat Putrinya tidak ada di Rumah (`.../meniduri-ibunya-saat-putrinya-tidak-ada-di-rumah`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Gadis Yang Kukenal di Buku Deary (`.../gadis-yang-kukenal-di-buku-deary`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Di Layanin Ibu Mertua (`.../di-layanin-ibu-mertua`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Gadis Yang Kukenal di Buku Deary (`.../gadis-yang-kukenal-di-buku-deary`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Gadis Yang Kukenal di Buku Deary (`.../gadis-yang-kukenal-di-buku-deary`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../gadis-yang-kukenal-di-buku-deary-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 84 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gadis Yang Kukenal di Buku Deary, URL=`.../gadis-yang-kukenal-di-buku-deary` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dojing.net/.../Komik-Hentai-Gadis-Yang-Kukenal-di-Buku-Deary-202x300.webp` (image/webp (container: extended), 7634 bytes, 202x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gadis-yang-kukenal-di-buku-deary` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dojing.net/.../Komik-Hentai-Gadis-Yang-Kukenal-di-Buku-Deary.webp` (image/webp (container: extended), 12630 bytes, 682x1012) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Full color, Sub indo, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baca komik hentai Gadis Yang Kukenal di Buku Deary bahasa Indonesia |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 84 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga.komik.me/.../01.webp` (image/webp (container: extended), 36334 bytes, 560x420) |  |  |  |
