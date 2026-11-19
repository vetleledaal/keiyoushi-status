# Extension Validation Report

- Extension: tachiyomi-id.mgkomik-v1.6.81
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 385263422541320229
- Source name: MG Komik
- Source language: id
- Selected manga input: popular offset 0: If You Are a Good Disciple, You Can Be a Teacher (`.../if-you-are-a-good-disciple-you-can-be-a-teacher`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | If You Are a Good Disciple, You Can Be a Teacher (`.../if-you-are-a-good-disciple-you-can-be-a-teacher`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | My Avatar Is Becoming the Final Boss (`.../my-avatar-is-becoming-the-final-boss-remake`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Demon King’s Channel (`.../the-demon-kings-channel`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | How To Get Skill SSS (`.../3423414`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | If You Are a Good Disciple, You Can Be a Teacher (`.../if-you-are-a-good-disciple-you-can-be-a-teacher`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | If You Are a Good Disciple, You Can Be a Teacher (`.../if-you-are-a-good-disciple-you-can-be-a-teacher`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | Chapter 00 (`.../chapter-00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=If You Are a Good Disciple, You Can Be a Teacher, URL=`.../if-you-are-a-good-disciple-you-can-be-a-teacher` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://id.mgkomik.cc/.../good-discipl.webp` (image/webp (encoding: lossy), 25240 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../if-you-are-a-good-disciple-you-can-be-a-teacher` |  |  |  |
| details thumbnail URL | PASS | `https://id.mgkomik.cc/.../good-discipl.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Ecchi, Fantasy, Harem, Manhua, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dia berasal dari zaman prasejarah, membawa takdir umat manusia, dan murid-muridnya yang tak terhitung jumlahnya melatih dua belas kaisar untuk umat manusia! Dia telah membesarkan begitu banyak anak laki-laki dan perempuan, sekarang orang ingin murid perempuan menggosok punggung ayah yang basah! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.mgis.my.id/.../001.webp` (image/webp (encoding: lossy), 18734 bytes, 700x393) |  |  |  |
