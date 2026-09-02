# Extension Validation Report

- Extension: tachiyomi-id.dojingnet-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8062443260299418342
- Source name: Dojing.net
- Source language: id
- Selected manga input: latest offset 0: Bertemu Bibi Wanita Mesum di Toilet Umum (`.../bertemu-bibi-wanita-mesum-di-toilet-umum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Lustful Wife Widia (`.../lustful-wife-widia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Meniduri Ibunya Saat Putrinya tidak ada di Rumah (`.../meniduri-ibunya-saat-putrinya-tidak-ada-di-rumah`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 12 | Bertemu Bibi Wanita Mesum di Toilet Umum (`.../bertemu-bibi-wanita-mesum-di-toilet-umum`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Teman Online ku Ternyata Seorang Wanita (`.../teman-online-ku-ternyata-seorang-wanita`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Bertemu Bibi Wanita Mesum di Toilet Umum (`.../bertemu-bibi-wanita-mesum-di-toilet-umum`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Bertemu Bibi Wanita Mesum di Toilet Umum (`.../bertemu-bibi-wanita-mesum-di-toilet-umum`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../bertemu-bibi-wanita-mesum-di-toilet-umum-chapter-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bertemu Bibi Wanita Mesum di Toilet Umum, URL=`.../bertemu-bibi-wanita-mesum-di-toilet-umum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dojing.net/.../Komik-Bertemu-Bibi-Wanita-Mesum-diToilet-Umum-225x300.webp` (image/webp (container: extended), 17338 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bertemu-bibi-wanita-mesum-di-toilet-umum` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dojing.net/.../Komik-Bertemu-Bibi-Wanita-Mesum-diToilet-Umum.webp` (image/webp (container: extended), 134436 bytes, 1200x1600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aunt, Big ass, Big breasts, Full color, Milf, Shota, Sub indo, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baca komik hentai Bertemu Bibi Wanita Mesum di Toilet Umum bahasa Indonesia |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manga.komik.me/.../01.webp` (image/webp (container: extended), 51408 bytes, 560x420) |  |  |  |
