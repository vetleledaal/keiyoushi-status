# Extension Validation Report

- Extension: tachiyomi-en.eighteenporncomic-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5133553291675008671
- Source name: 18 Porn Comic
- Source language: en
- Selected manga input: latest offset 0: Jimi de megane na Ausu-chan jitsu ha chou kyonyuu (`.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class Uncensored (`.../secret-class-uncensored`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Drunk on You (Official Uncensored) (`.../drunk-on-you-official-uncensored`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Jimi de megane na Ausu-chan jitsu ha chou kyonyuu (`.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Family Matters 3 (`.../family-matters-3`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Jimi de megane na Ausu-chan jitsu ha chou kyonyuu (`.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jimi de megane na Ausu-chan jitsu ha chou kyonyuu (`.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | # English (`.../english`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jimi de megane na Ausu-chan jitsu ha chou kyonyuu, URL=`.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://bk.18porncomic.com/.../cover_thumb_2.webp` (image/jpeg, 8880 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jimi-de-megane-na-ausu-chan-jitsu-ha-chou-kyonyuu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bk.18porncomic.com/.../cover_250x350.jpg` (image/jpeg, 20672 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Oujano Kaze |  |  |  |
| details genres | PASS | Sole Female, Sole Male, Big Breasts, Glasses, Hentai, Kissing |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jimi de megane na Ausu-chan jitsu ha chou kyonyuu Hentai also known as (AKA) The Plain, Glasses-Clad Aussa-chan Is Actually Super Busty \| 地味でメガネなアウスちゃん実は超巨乳 . This OnGoing 18PornComic was released on. Jimi de megane na Ausu-chan jitsu ha chou kyonyuu is about Sole Female, Sole Male, Big Breasts, Glasses, Hentai, Kissing, comic.<br><br>Alternative Names:<br>The Plain, Glasses-Clad Aussa-chan Is Actually Super Busty \| 地味でメガネなアウスちゃん実は超巨乳 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bk.18porncomic.com/.../01.jpg` (image/jpeg, 699091 bytes, 1280x1790) |  |  |  |
