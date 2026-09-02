# Extension Validation Report

- Extension: tachiyomi-id.mihentai-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3141331376595743728
- Source name: Mihentai
- Source language: id
- Selected manga input: popular offset 0: Manbiki Mama to Tencho no Musuko (`.../manbiki-mama-to-tencho-no-musuko`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Manbiki Mama to Tencho no Musuko (`.../manbiki-mama-to-tencho-no-musuko`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Pilihan Terbaik Bibi (`.../pilihan-terbaik-bibi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Kyonyuu Yome – Istri Yang Bertubuh Seksi (`.../kyonyuu-yome-istri-yang-bertubuh-seksi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Kimottama Kaa-chan to Kenka Bakari no Neet no Ore ga Kaa-san ni Nakadashi shite kara Nakayoku natta Hanashi (`.../kimottama-kaa-chan-to-kenka-bakari-no-neet-no-ore-ga-kaa-san-ni-nakadashi-shite-kara-nakayoku-natta-hanashi`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Manbiki Mama to Tencho no Musuko (`.../manbiki-mama-to-tencho-no-musuko`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Manbiki Mama to Tencho no Musuko (`.../manbiki-mama-to-tencho-no-musuko`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 3 (`.../manbiki-mama-to-tencho-no-musuko-3`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Manbiki Mama to Tencho no Musuko, URL=`.../manbiki-mama-to-tencho-no-musuko` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../Komik-Hentai-Manbiki-Mama.jpg` (image/jpeg, 66913 bytes, 715x959) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manbiki-mama-to-tencho-no-musuko` |  |  |  |
| details thumbnail URL | PASS | `https://i3.wp.com/.../Komik-Hentai-Manbiki-Mama.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aunt, Beautymark, Bigbreast, Blowjob, Cheating, Full color, Milf, Milk, Mom & son, Ntr (netorare), Shota, Sub indo, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kisah ibu mengutil belanjaan ditoko yang diketahui oleh anak yang punya toko |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | 1 of 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i3.wp.com/.../01-35.webp` (image/webp (encoding: lossy), 415094 bytes, 1200x1600) |  |  |  |
