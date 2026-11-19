# Extension Validation Report

- Extension: tachiyomi-all.fsicomics-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6559215119939537337
- Source name: FSI Comics
- Source language: en
- Selected manga input: popular offset 0: Parinam Chapter 1 – Natural Instinct – The Wise Monk (`.../parinam-chapter-1-natural-instinct-the-wise-monk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Parinam Chapter 1 – Natural Instinct – The Wise Monk (`.../parinam-chapter-1-natural-instinct-the-wise-monk`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Forbidden Mother’s Kinks Chapter 3 – Mr.Foxx (`.../forbidden-mothers-kinks-chapter-3-mr-foxx`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Tridevi Chapter 21 Hindi – Silk Route Ira Raman (`.../tridevi-chapter-21-hindi-silk-route-ira-raman`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Momo’s Approval (DanDaDan) – Suavi-Cream (`.../momos-approval-dandadan-suavi-cream`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Parinam Chapter 1 – Natural Instinct – The Wise Monk (`.../parinam-chapter-1-natural-instinct-the-wise-monk`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Parinam Chapter 1 – Natural Instinct – The Wise Monk (`.../parinam-chapter-1-natural-instinct-the-wise-monk`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../parinam-chapter-1-natural-instinct-the-wise-monk`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Parinam Chapter 1 – Natural Instinct – The Wise Monk, URL=`.../parinam-chapter-1-natural-instinct-the-wise-monk` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Forbidden Mother’s Kinks Chapter 3 – Mr.Foxx, URL=`.../forbidden-mothers-kinks-chapter-3-mr-foxx` at page 1 offset 16 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fsicomics.com/.../parinam-chapter-1-natural-instinct-the-wise-monk-001.webp` (image/webp (container: extended), 197812 bytes, 2560x3291) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../parinam-chapter-1-natural-instinct-the-wise-monk` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 3D, Aunty, Cuckold, Exam Incentive, Indian, MILF, Mother, Natural Instinct, Reward Sex, Saree, Taboo, The Wise Monk |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parinam Chapter 1 by Natural Instinct – The Wise Monk. Amrit passed his exams and finally gets what the curvy aunty in the sheer saree promised. Shitij can only sit there and watch while Amrit peels the fabric off her, plays with her navel, and takes every inch of the reward he earned. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fsicomics.com/.../parinam-chapter-1-natural-instinct-the-wise-monk-001.webp` (image/webp (container: extended), 197812 bytes, 2560x3291) |  |  |  |
