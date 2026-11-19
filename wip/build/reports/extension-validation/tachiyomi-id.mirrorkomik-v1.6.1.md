# Extension Validation Report

- Extension: tachiyomi-id.mirrorkomik-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6916717115805451393
- Source name: MirrorKomik
- Source language: id
- Selected manga input: popular offset 0: Makhluk-makhluk Menakjubkan (`.../makhluk-makhluk-menakjubkan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Makhluk-makhluk Menakjubkan (`.../makhluk-makhluk-menakjubkan`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | Musuh Terpanas (`.../musuh-terpanas`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 17 | Pemberontak Dari Akademi Apokalips (`.../pemberontak-dari-akademi-apokalips`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 14 | Makhluk-makhluk Menakjubkan (`.../makhluk-makhluk-menakjubkan`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Makhluk-makhluk Menakjubkan (`.../makhluk-makhluk-menakjubkan`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1264 | Ch. 1 (`.../makhluk-makhluk-menakjubkan-qmotfsm-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Makhluk-makhluk Menakjubkan, URL=`.../makhluk-makhluk-menakjubkan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdngue.my.id/.../15589_6ae0be09db5bd.webp` (image/webp (encoding: lossy), 11026 bytes, 160x213) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../makhluk-makhluk-menakjubkan` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdngue.my.id/.../15589_6ae0be09db5bd.webp` (image/webp (encoding: lossy), 6212 bytes, 160x100) |  |  |  |
| details author | PASS | Xue Xia Mao Yao Zi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Project, Historical, MTL, Comedy, Animals, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seiring dengan kemajuan ilmu pengetahuan, makhluk-makhluk mitologi yang dulunya agung kini tak lagi seperti masa lampau. Si Bu Xiang, salah satu makhluk mitologi, menerima perintah untuk turun ke dunia fana guna membantu sesama makhluk mitologi yang tengah mengalami kesulitan saat mengembara di dunia manusia. You Shou Yan \| Bestas Fabulosas \| There Are Beasts \| Youshou Yan \| 有兽焉 Di dunia sekuler ini, ia bertemu dengan rekan lamanya, Pi Xiu, yang sedang dalam situasi sulit; sahabat minumnya, Tu Ye, yang sedang bernasib sial; serta bersaudara Jue-si emas dan perak-yang diturunkan ke dunia fana… Kisah seperti apa yang akan terjalin di antara mereka? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1264 chapters |  |  |  |
| chapter dates | LINT | 1263 of 1264 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1263 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://mirrorkomik.info/.../makhluk-makhluk-menakjubkan-qmotfsm-1` to `https://mirrorkomik.info/.../login` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
