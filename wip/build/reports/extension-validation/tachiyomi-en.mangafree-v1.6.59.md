# Extension Validation Report

- Extension: tachiyomi-en.mangafree-v1.6.59
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
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3386549954655095711
- Source name: Mangafree
- Source language: en
- Selected manga input: popular offset 0: Someone Stop Her! (`.../3285`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Someone Stop Her! (`.../3285`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Devil Wants To Hug (`.../872`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I Became an Apartment Security Manager (`.../3760`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Obscene Note (`.../5545`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Someone Stop Her! [UNCENSORED] (`.../5553`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Someone Stop Her! (`.../3285`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 157 | Chapter 0 Prologue (`.../chapter-0-prologue`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Someone Stop Her!, URL=`3285` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangafree.info/.../111111-4-350x476.jpg` (image/jpeg, 43694 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `3285` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangafree.info/.../111111-4-193x278.jpg` (image/jpeg, 17430 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | To regain his peace, Gangchan must welcome his blood-curdling smoking neighbor and her housemates into his home. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 157 chapters |  |  |  |
| chapter dates | PASS | 157 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://mangafree.info/.../01.jpg` (image/jpeg, 30032 bytes, 720x500) |  |  |  |
