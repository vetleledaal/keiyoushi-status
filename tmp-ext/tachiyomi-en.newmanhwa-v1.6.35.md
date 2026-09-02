# Extension Validation Report

- Extension: tachiyomi-en.newmanhwa-v1.6.35
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3639911276143172075
- Source name: New Manhwa
- Source language: en
- Selected manga input: popular offset 0: MILF Hunting In Another World (`.../milf-hunting-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 24 | I Will Protect You (`.../i-will-protect-you`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 24 | A Journal Exploring Desire (`.../a-journal-exploring-desire`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 24 | Eldomia Era: The Reincarnated Vengeful (`.../eldomia-era-the-reincarnated-vengeful`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 133 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILF Hunting In Another World, URL=`.../milf-hunting-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.saymanhwa.com/.../20260821051400-feaa06c5fe59-thumb-300x420.webp` (image/webp (encoding: lossy), 18384 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../milf-hunting-in-another-world` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | ERO404 |  |  |  |
| details artist | PASS | ERO404 |  |  |  |
| details genres | PASS | Action, Drama, Ecchi, Fantasy, HAREM, Historical, Martial Arts, Mature, Mystery, Psychological, Romance, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After being caught red-handed with other MILFS, Taeyang escaped to another world. Sharing a bed with a first-class MILF with an amazing body?! Enjoy~! Can Taeyang safely create his own harem in this world? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 133 chapters |  |  |  |
| chapter dates | PASS | 133 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-b41.jpg` (image/jpeg, 473346 bytes, 718x3059) |  |  |  |
