# Extension Validation Report

- Extension: tachiyomi-id.cosmicscansid-v1.4.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6559481336553833282
- Source name: CosmicScans
- Source language: id
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Fight Delivery (`.../fight-delivery`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Monster Jenius dari Keluarga Konglomerat (`.../monster-jenius-dari-keluarga-konglomerat`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Another World Where I Can't Even Collapse and Die (`.../another-world-where-i-cant-even-collapse-and-die`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 623 | Chapter 01 (`.../lookism-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 105 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`.../lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdncid.csmcscns.id/.../Lookism-1.webp` (image/webp (container: extended), 824276 bytes, 960x1246) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | PASS | `https://cdncid.csmcscns.id/.../Lookism-1.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Action, Shounen, School Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lookism. Park Hyungsuk, orang yang gendut dan jelek, dirundung oleh orang-orang di lingkungan sekolahnya setiap hari. Namun, sebuah keajaiban akan segera terjadi. Dia bangun di sebuah tubuh yang berbeda. Kini, dia menjadi tinggi, tampan, dan lebih keren di tubuhnya yang sekarang. Daniel bertujuan untuk mencapai semua yang tidak dapat dia capai sebelumnya. Seberapa jauh tubuhnya ini akan membawanya pergi...? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 623 chapters |  |  |  |
| chapter dates | PASS | 623 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 105 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://csid.skyfile.me/.../1.webp` (image/webp (encoding: lossy), 16592 bytes, 650x929) |  |  |  |
