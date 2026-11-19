# Extension Validation Report

- Extension: tachiyomi-pt.karikari-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7314811139529752687
- Source name: KariKari
- Source language: pt-BR
- Selected manga input: popular offset 0: Sense Life (`.../sense-life`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Sense Life (`.../sense-life`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | BEHEMOTH (`.../behemoth`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Quando o amor cria raízes (`.../quando-o-amor-cria-raizes`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | PROJECT PARADOX (`.../project-paradox-3`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sense Life (`.../sense-life`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sense Life (`.../sense-life`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Capítulo 1: Um acordo até a morte (`.../sense-life-um-acordo-ate-a-morte`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in to the site in WebView to read this chapter: +18 works need an account that confirmed its age, and paid chapters must be unlocked | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in to the site in WebView to read this chapter: +18 works need an account that confirmed its age, and paid chapters must be unlocked | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sense Life, URL=`.../sense-life` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.karikari.app/.../capa_vertical-dd026aa2-953a-4666-ab79-8d2f4c2f4728.png` (image/webp (encoding: lossy), 193930 bytes, 815x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sense-life` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.karikari.app/.../capa_vertical-dd026aa2-953a-4666-ab79-8d2f4c2f4728.png` |  |  |  |
| details author | PASS | Glitch Tellend |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Comédia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Noah é um garoto pacato que procura por um sentido para sua vida, seus dias cotidianos irão sumir após encontrar Kaleb, um usuário de drogas que tem uma grande recompensa por sua cabeça. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in to the site in WebView to read this chapter: +18 works need an account that confirmed its age, and paid chapters must be unlocked |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
