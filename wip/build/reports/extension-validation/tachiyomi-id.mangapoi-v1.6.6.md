# Extension Validation Report

- Extension: tachiyomi-id.mangapoi-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 3996702149989218625
- Source name: Mangapoi
- Source language: id
- Selected manga input: popular offset 0: I’m the Only Man on the Military Base (`.../im-the-only-man-on-the-military-base`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | I’m the Only Man on the Military Base (`.../im-the-only-man-on-the-military-base`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Masu×Masu×Masu (`.../masumasumasu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Runaway Wife (`.../runaway-wife`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Mind Control (`.../mind-control`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I’m the Only Man on the Military Base (`.../im-the-only-man-on-the-military-base`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’m the Only Man on the Military Base (`.../im-the-only-man-on-the-military-base`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Chapter 1 (`.../im-the-only-man-on-the-military-base-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I’m the Only Man on the Military Base, URL=`.../im-the-only-man-on-the-military-base` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` -> all 30 manga URLs (examples: `.../im-the-only-man-on-the-military-base`, `.../widia-and-daddy-remake`, `.../i-became-a-pornhwa-npc`) |  |  |  |
| thumbnail | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but was 'data' | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../im-the-only-man-on-the-military-base` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | TwoJ |  |  |  |
| details artist | PASS | Pab |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Mature, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sinopsis Komik I’m the Only Man on the Military Base: Aku sedang mempertimbangkan untuk mengirimmu bergabung dengan tentara wanita Jaejun adalah peserta dalam Dia akhirnya dipindahkan ke pangkalan militer yang seluruhnya terdiri dari tentara wanita dengan dirinya sebagai satusatunya lakilaki Apakah dia dapat menyelesaikan dinas militernya di pangkalan yang penuh godaan di setiap sudut |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangapoi.io/.../advanced-search <redacted query values: order>` to `https://mangapoi.cloud/.../advanced-search <redacted query values: order>` (1 redirects); popular: `https://mangapoi.io/.../advanced-search <redacted query values: order>` to `https://mangapoi.cloud/.../advanced-search <redacted query values: order>` (1 redirects); popular: `https://mangapoi.io/.../2 <redacted query values: order>` to `https://mangapoi.cloud/.../2 <redacted query values: order>` (1 redirects); popular: `https://mangapoi.io/.../im-the-only-man-on-the-military-base` to `https://mangapoi.cloud/.../im-the-only-man-on-the-military-base` (1 redirects); popular: `https://mangapoi.io/.../advanced-search <redacted query values: title, author, yearx, status, type, and order>` to `https://mangapoi.cloud/.../advanced-search <redacted query values: title, author, yearx, status, type, and order>` (1 redirects); popular: `https://mangapoi.io/.../im-the-only-man-on-the-military-base-chapter-1` to `https://mangapoi.cloud/.../im-the-only-man-on-the-military-base-chapter-1` (1 redirects); popular: `https://mangapoi.io/.../2 <redacted query values: order>` to `https://mangapoi.cloud/.../2 <redacted query values: order>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.gilakomik.id/.../image-1.webp` (image/jpeg, 291301 bytes, 1810x1018; server Content-Type: image/webp) |  |  |  |
