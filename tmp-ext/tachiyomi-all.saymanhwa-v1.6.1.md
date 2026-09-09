# Extension Validation Report

- Extension: tachiyomi-all.saymanhwa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.h
- Source ID: 160957764321519511
- Source name: SayManhwa
- Source language: en
- Selected manga input: popular offset 0: Beautiful Days (`.../beautiful-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Beautiful Days (`.../beautiful-days`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | MILF Exchange Plan (`.../milf-exchange-plan`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Ramia-Yana (`.../ramia-yana`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pick Me Up (`.../pick-me-up`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 90 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful Days, URL=`.../beautiful-days` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=I Didn’t Sign Up For This, URL=`.../i-didn-t-sign-up-for-this` at page 1 offset 1 and page 2 offset 2, title=Get Out of Here!, URL=`.../get-out-of-here` at page 1 offset 3 and page 2 offset 8, title=Sugar Daddy / Papa Katz, URL=`.../sugar-daddy-papa-katz` at page 1 offset 14 and page 2 offset 4, title=Set It!, URL=`.../set-it` at page 1 offset 17 and page 2 offset 22, title=A Theme For Every Building, URL=`.../a-theme-for-every-building` at page 1 offset 20 and page 2 offset 6 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.saymanhwa.com/.../20260821051257-2b4441d9bb8d-thumb-300x420.webp` (image/webp (encoding: lossy), 12120 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-days` |  |  |  |
| details thumbnail URL | PASS | `https://img.saymanhwa.com/.../20260821051257-2b4441d9bb8d-thumb-300x420.webp` |  |  |  |
| details author | PASS | Yuwol |  |  |  |
| details artist | PASS | Nunnya |  |  |  |
| details genres | PASS | Adult, Action, Drama, Ecchi, Fantasy, Harem, Historical, Martial Arts, Mature, Mystery, Psychological, Romance, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Beautiful Days is an ongoing mature drama centered on people who conceal their private circumstances and desires while trying to maintain control in public. The available chapters place much of the action in a contemporary workplace, where assistants, managers, senior staff, and executives navigate formal conversations alongside deeply personal tensions. After Assistant Manager Lee Ruda experiences a disturbing encounter, the situation becomes entangled with secrecy, shame, workplace reputation, and conflicting attempts to explain what happened. Dialogue directly identifies the incident as rape, while the people around Ruda struggle with denial, concealment, anger, and the need to set matters right. A motel, a change of clothes, messages left unanswered, and uneasy interactions at work all reinforce the story’s atmosphere of exposure and hidden consequences. The central conflict is not simply between desire and restraint, but also between vulnerability and power: those who appear confident or authoritative may be hiding fear, confusion, or private needs. With its listed blend of action, drama, fantasy, harem, historical, martial arts, mystery, psychological, romance, school life, and mature elements, the series presents a broad genre profile; the supplied scenes most clearly support a psychologically charged workplace drama with explicit adult content and mystery surrounding personal motives. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 90 chapters |  |  |  |
| chapter dates | PASS | 90 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-e12.jpg` (image/jpeg, 1037416 bytes, 720x14424) |  |  |  |
