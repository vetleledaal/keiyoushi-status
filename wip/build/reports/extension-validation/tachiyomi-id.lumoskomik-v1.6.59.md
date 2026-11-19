# Extension Validation Report

- Extension: tachiyomi-id.lumoskomik-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: hwalumi
- Source ID: 2530259860313477889
- Source name: LumosKomik
- Source language: id
- Selected manga input: popular offset 0: The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Limit-Breaking Genius Mage (`.../limit-breaking-genius-mage`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Aisai no Ura Aka (`.../aisai-no-ura-aka`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Only Need the Duke’s Child (`.../i-only-need-the-dukes-child`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 31 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Return of the Scorned Genius, URL=`the-return-of-the-scorned-genius` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lms.imgsvr.my.id/.../Qourtw9VcFfQ.webp` (image/webp (encoding: lossy), 148042 bytes, 600x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-return-of-the-scorned-genius` |  |  |  |
| details thumbnail URL | PASS | `https://lms.imgsvr.my.id/.../Qourtw9VcFfQ.webp` |  |  |  |
| details author | PASS | Orange Perch |  |  |  |
| details artist | PASS | Orange Perch |  |  |  |
| details genres | PASS | Action, Fantasy, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sempat kehilangan kekuatan dan lumpuh di kursi roda selama tiga tahun, mantan jenius Chiyuan Suou akhirnya bangkit kembali berkat hancurnya sebuah segel pembatas. Ia kini bangkit dengan Job misterius sebagai Lord of the Abyss. Bersama pasukan abisalnya, Chiyuan memulai aksi balas dendam dan kebangkitan epik untuk mencari sang ayah yang hilang sekaligus menembus Alam Dewa. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | LINT | All 31 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=31 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lms.imgsvr.my.id/.../001_auRDqh.webp` (image/webp (encoding: lossy), 760606 bytes, 800x8400) |  |  |  |
