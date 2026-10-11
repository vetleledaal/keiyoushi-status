# Extension Validation Report

- Extension: tachiyomi-ko.newxtoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 1562897350957827542
- Source name: NewXToon
- Source language: ko
- Selected manga input: popular offset 0: 외모지상주의 (`.../8067`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | 외모지상주의 (`.../8067`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 23 | 참교육 (`.../9003`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 23 | 게임은 살인이다 (`.../2183`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 23 | 나는 최약체 드래곤 테이머 (`.../164`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 외모지상주의 (`.../8067`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 외모지상주의 (`.../8067`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 624 | 1화 (`.../662112`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=외모지상주의, URL=`8067` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://user281.quicksharefiles.top/.../d79489a00b815daf6fb2e84aac223a6791efeb4c.jpg` (image/jpeg, 52157 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `8067` |  |  |  |
| details thumbnail URL | PASS | `https://user281.quicksharefiles.top/.../d79489a00b815daf6fb2e84aac223a6791efeb4c.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 일반만화, 학원.../%EC%BA%A0%ED%8D%BC%EC%8A%A4, 먼치킨, 드라마 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 못생기고 뚱뚱하다고 괴롭힘을 당하며 루저 인생만 살아온 내가 잘생겨졌다는 이유로 인싸가 됐다. 어느 날 자고 일어났더니 갑자기 완벽한 외모와 몸을 지닌 사람이 되어 깨어난다면? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 624 chapters |  |  |  |
| chapter dates | PASS | 624 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://user281.quicksharefiles.top/.../3dee3bcc7978aa37afc7499cdd95ae2130b09cee.jpg` (image/jpeg, 141905 bytes, 690x2908) |  |  |  |
