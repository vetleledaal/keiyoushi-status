# Extension Validation Report

- Extension: tachiyomi-all.mangatoon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 4795663388852759880
- Source name: MangaToon (Limited)
- Source language: en
- Selected manga input: popular offset 0: Bossy President (`.../bossy-president <redacted query values: content_id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Bossy President (`.../bossy-president <redacted query values: content_id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | My Babes Are My Wingmen! (`.../my-babes-are-my-wingmen <redacted query values: content_id>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Trapped By Black King ~ I Fell Into A Mafia Comic (`.../trapped-by-black-kingi-fell-into-a-mafia-comic <redacted query values: content_id>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bossy President (`.../bossy-president <redacted query values: content_id>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bossy President (`.../bossy-president <redacted query values: content_id>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Episode 1 (`.../1591`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bossy President, URL=`.../bossy-president <redacted query values: content_id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cn-e-pic-aliyun.mangatoon.mobi/.../7859c5a.webp-posterend6` (image/webp (encoding: lossy), 31598 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bossy-president <redacted query values: content_id>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cn-e-pic-aliyun.mangatoon.mobi/.../7859c5a.jpg` (image/jpeg, 28264 bytes, 300x400) |  |  |  |
| details author | PASS | iCiyuan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | A paranoid present came to me and ask for a kid?! He is handsome. He is rich. He is a high-born and the heir of a multinational company. However, there is definitely something wrong with his brain!!! Because I have no idea where the kid he is talking about and I have never seen him before! Come on, somebody helps me. How could I get away with this bossy president!!! Woman, give my child to me! MangaToon got authorization from iCiyuan to publish this work, the content is the author's own point of view, and does not represent the stand of MangaToon. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangatoon.mobi/.../hot <redacted query values: type and page>` to `https://mangatoon.mobi/.../hot` (1 redirects); popular: `https://mangatoon.mobi/.../new <redacted query values: type and page>` to `https://mangatoon.mobi/.../new` (1 redirects); popular: `https://mangatoon.mobi/.../hot <redacted query values: type and page>` to `https://mangatoon.mobi/.../hot <redacted query values: page>` (1 redirects) |  |  |  |
| page load | PASS | `https://en-c-pic-aliyun.mangatoon.mobi/.../6.jpg` (image/jpeg, 219610 bytes, 1000x1414) |  |  |  |
