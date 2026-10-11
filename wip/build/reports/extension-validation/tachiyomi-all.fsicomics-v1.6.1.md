# Extension Validation Report

- Extension: tachiyomi-all.fsicomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6559215119939537337
- Source name: FSI Comics
- Source language: en
- Selected manga input: popular offset 0: My Neighbor’s Widow Chapter 57 – Rose Blue 3D (`.../my-neighbors-widow-chapter-57-rose-blue-3d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | My Neighbor’s Widow Chapter 57 – Rose Blue 3D (`.../my-neighbors-widow-chapter-57-rose-blue-3d`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Au Naturel Chapter 30 – Pegasus Smith (`.../au-naturel-chapter-30-pegasus-smith`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Chloe & Amber: Ragnarok – Cherry Mouse Street (`.../chloe-amber-ragnarok-cherry-mouse-street`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Hidden Desires Chapter 1 – MagicDragon3D (`.../hidden-desires-chapter-1-magicdragon3d`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Neighbor’s Widow Chapter 57 – Rose Blue 3D (`.../my-neighbors-widow-chapter-57-rose-blue-3d`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../my-neighbors-widow-chapter-57-rose-blue-3d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 92 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 79/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fsicomics.com/.../my-neighbors-widow-chapter-57-rose-blue-3d-hd-029.webp` (image/webp (container: extended), 591786 bytes, 1440x3211) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-neighbors-widow-chapter-57-rose-blue-3d` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 3D, Anal, Big Ass, Big Breasts, Deepthroat, Incest, MILF |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | My Neighbor's Widow Chapter 57 by Rose Blue 3D. A very attractive MILF is busy working in her office at night. She tries to concentrate, but she can't forget |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 92 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fsicomics.com/.../my-neighbors-widow-chapter-57-rose-blue-3d-001.webp` (image/webp (container: extended), 180372 bytes, 1440x3211) |  |  |  |
